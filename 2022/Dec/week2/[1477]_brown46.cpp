﻿

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{	
	//cout << "mnl 입력" << endl;
	int m;
	int n;
	int l;
	cin >> m >> n >> l;
	int input;
	vector<int> vec1;
//	cout << "휴게소 위치" << endl;
	for (int i = 0; i < m; i++) {
		cin >> input;
		vec1.push_back(input);
	}
	vec1.push_back(0);
	vec1.push_back(l);



	vector<int> vec2;
	for (int k = 0; k < n; k++) {
		sort(vec1.begin(), vec1.end());
		vec2.clear();


		for (int i = 0; i < vec1.size() - 1; i++) {
			vec2.push_back((vec1[i + 1] - vec1[i]));
		}
		sort(vec2.begin(), vec2.end());



		for (int i = 0; i < vec1.size() - 1; i++) {
			if (vec1[i + 1] - vec1[i] == vec2[vec2.size() - 1]) {
				vec1.push_back((vec1[i + 1] + vec1[i]) / 2);
				break;
			}
		}
		sort(vec1.begin(), vec1.end());
	}


	vec2.clear();
	for (int i = 0; i < vec1.size() - 1; i++) {
		vec2.push_back((vec1[i + 1] - vec1[i]));
	}
	sort(vec2.begin(), vec2.end());
	cout << vec2[vec2.size() - 1]<<endl;
		
}

// 프로그램 실행: <Ctrl+F5> 또는 [디버그] > [디버깅하지 않고 시작] 메뉴
// 프로그램 디버그: <F5> 키 또는 [디버그] > [디버깅 시작] 메뉴

// 시작을 위한 팁: 
//   1. [솔루션 탐색기] 창을 사용하여 파일을 추가/관리합니다.
//   2. [팀 탐색기] 창을 사용하여 소스 제어에 연결합니다.
//   3. [출력] 창을 사용하여 빌드 출력 및 기타 메시지를 확인합니다.
//   4. [오류 목록] 창을 사용하여 오류를 봅니다.
//   5. [프로젝트] > [새 항목 추가]로 이동하여 새 코드 파일을 만들거나, [프로젝트] > [기존 항목 추가]로 이동하여 기존 코드 파일을 프로젝트에 추가합니다.
//   6. 나중에 이 프로젝트를 다시 열려면 [파일] > [열기] > [프로젝트]로 이동하고 .sln 파일을 선택합니다.
