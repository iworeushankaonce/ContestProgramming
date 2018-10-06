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
		int a, b, c;
		cin >> a >> b >> c;
		bool fit = true;
		if (a > 20 or b > 20 or c > 20)
		{
			fit = false;
		}
		cout << "Case " << (cas + 1) << ": ";
		cout << (fit ? "good" : "bad") << endl;
	}
	
	return 0;
}
/* 
g++ -std=c++11 uva12372-Packing_for_Holiday.cpp

2
20 20 20
1 2 21

Sample Output
Case 1: good
Case 2: bad
*/