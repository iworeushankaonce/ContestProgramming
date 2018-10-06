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
	int sum = 0;
	for(int cas = 0; cas < cases; ++cas)
	{
		string s; cin >> s;
		if (s == "donate")
		{
			int a; cin >> a;
			sum += a;
		}
		else
		{
			cout << sum << endl;
		}
	}
	
	return 0;
}
/* 
g++ -std=c++11 uva12403-Save_Setu.cpp

4
donate 1000
report
donate 500
report

Sample Output
1000
1500
*/