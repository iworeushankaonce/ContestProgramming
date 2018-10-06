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
		int n; cin >> n;
		int place = 0;
		int a[n];
		for (int i = 0; i < n; ++i)
		{
			string s; cin >> s;
			if (s == "LEFT")
			{
				--place;
				a[i] = -1;
			}
			else if (s == "RIGHT")
			{
				++place;
				a[i] = 1;
			}
			else if (s == "SAME")
			{
				string s2; cin >> s2;
				int b; cin >> b;
				place += a[b-1];
				a[i] = a[b-1];
			}
		}
		cout << place << endl;
	}
	
	return 0;
}
/* 
g++ -std=c++11 uva12503-Robot_Instructions.cpp

2
3
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4

Sample Output
1
-5
*/