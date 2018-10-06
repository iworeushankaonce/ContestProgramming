#include <iostream>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

int main()
{
	int cases; cin >> cases;
	for(int cas = 0; cas < cases; ++cas)
	{
		vector <int> a;
		string name[10];
		for(int i = 0; i < 10; ++i)
		{
			cin >> name[i];
			int n;
			cin >> n;
			a.push_back(n);
		}
		auto m = max_element(a.begin(), a.end());
		
		int max = *m;
		
		cout << "Case #" << (cas + 1) << ":" << endl;
		
		for(int i = 0; i < 10; ++i)
		{
			if (a[i] == max)
			{
				cout << name[i] << endl;
			}
		}
		
	}
	
	return 0;
}
// g++ -std=c++11 uva12015-Google_is_Feeling_Lucky.cpp

/*

2
www.youtube.com 1
www.google.com 2
www.google.com.hk 3
www.alibaba.com 10
www.taobao.com 5
www.bad.com 10
www.good.com 7
www.fudan.edu.cn 8
www.university.edu.cn 9
acm.university.edu.cn 10
www.youtube.com 1
www.google.com 2
www.google.com.hk 3
www.alibaba.com 11
www.taobao.com 5
www.bad.com 10
www.good.com 7
www.fudan.edu.cn 8
acm.university.edu.cn 9
acm.university.edu.cn 10

Sample Output

Case #1:
www.alibaba.com
www.bad.com
acm.university.edu.cn
Case #2:
www.alibaba.com

*/