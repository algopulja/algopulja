#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    
    ios::sync_with_stdio(0); cin.tie(0);
    
    // true or false로 가능한 수인지를 체크할 것이다
    bool arr[1000];
    // 나중에 true가 몇 개 남았는지 카운트 할 변수
    int cnt = 0;
    
    // 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수는
    // 123 ~ 987 중 같은 숫자가 있는 수와 0이 있는 수를 제외한 수
    for (int i=123; i<=987; i++) {
        // 먼저 true로 설정한 후
        arr[i] = true;
        
        string num = to_string(i);
        
        // 같은 수가 있거나 0이 있는 경우 false로 재설정한다
        if( num[0] == num[1] || num[1] == num[2] || num[0] == num[2] ) arr[i] = false;
        if( num[0] - '0' == 0 || num[1] - '0' == 0 || num[2] - '0' == 0 ) arr[i] = false;
    }
    
    int n;
    cin >> n;
    
    while(n--) {
        string answer;
        int strike, ball;
        cin >> answer >> strike >> ball;
        
        for (int i=123; i<=987; i++) {
            
            int tmp_strike = 0, tmp_ball = 0;
            
            string num = to_string(i);
            
            // answer을 돈다
            for (int i=0; i<3; i++) {
                // num을 돈다
                for (int j=0; j<3; j++) {
                    // answer과 num의 숫자가 같고, 자리도 같다면 => 스트라이크++
                    if (answer[i] == num[j] && i == j) tmp_strike++;
                    // 숫자만 같다면 => 볼++
                    else if (answer[i] == num[j]) tmp_ball++;
                }
            }
            
            // 스트라이크와 볼 중 하나라도 조건에 부합하지 않는다면 false로 바꿔준다.
            if (strike != tmp_strike || ball != tmp_ball) arr[i] = false;
        }
        
    }
    
    // true로 남아있으면 가능성 있는 답
    for (int i=123; i<=987; i++) {
        if (arr[i]) cnt++;
    }
    
    cout << cnt;
    
}
