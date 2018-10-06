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
		string s; cin >> s;
		if(s == "1" or s == "4" or s == "78")
		{
			cout << "+" << endl;
		}else if (s[s.size() - 1] == '5' and s[s.size() - 2] == '3')
		{
			cout << "-" << endl;
		}else if (s[0] == '9' and s[s.size() - 1] == '4')
		{
			cout << "*" << endl;
		}else
		{
			cout << "?" << endl;
		}
	}
	
	return 0;
}
/* 
g++ -std=c++11 uva00621-Secret_Research.cpp

4
78
7835
19078
944

Sample Output 

+
-
?
*
*/