#include <iostream>
#include <algorithm>

using namespace std;

int n, m;
int arr[50][50];

// 꼭짓점이 범위 안에 있는지 확인하기
bool in_range(int i, int j, int l) {
    return (i+l < n && j+l < m);
}

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);

    int side = 1;
    cin >> n >> m;
    
    // 입력 받은 값 2차원 배열에 저장하기
    for (int i=0; i<n; i++) {
        
        // 문자열로 입력 받아서
        string row;
        cin >> row;
        
        for (int j=0; j<m; j++) {
            // 한 문자씩 int로 변환 후 저장
            arr[i][j] = row[j] - '0';
        }
        
    }
    
    // 배열의 원소 - arr[i][j]를 하나씩 돌면서 만들 수 있는 정사각형 꼭짓점 확인
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            for (int l=1; l<min(n,m); l++) {
                // 꼭짓점 4개 : arr[i][j], arr[i+l][j], arr[i][j+l], arr[i+l][j+l]
                if (in_range(i, j, l) && arr[i][j] == arr[i+l][j] && arr[i][j] == arr[i][j+l] && arr[i][j] == arr[i+l][j+l]) {
                    // 정사각형 한 변의 길이 = l + 1
                    side = max(side, l + 1);
                }
            }
        }
    }
    cout << side * side;
}
