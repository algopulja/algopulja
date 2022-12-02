#include <iostream>
#include <algorithm>

using namespace std;

int answer;

void f(int sum, int num) {
    if (sum > num) return;
    if (sum == num) {
        answer++;
        return;
    }
    f(sum+1, num);
    f(sum+2, num);
    f(sum+3, num);
}

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    int n;
    cin >> n;
    
    while(n--) {
        
        int num;
        cin >> num;
        
        answer = 0;

        f(0, num);
        
        cout << answer << "\n";
    }
}
