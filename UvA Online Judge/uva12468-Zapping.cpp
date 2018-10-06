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
	int a; int b;
	cin >> a >> b;
	while(a != -1 and b != -1)
	{
		int c1 = 0; int c2 = 0;
		int ac = a;
		int bc = b;
		while(ac != bc)
		{
			++ac;
			++c1;
			if (ac == 100) ac = 0;
		}
		while(a != b)
		{
			--a;
			++c2;
			if (a == -1) a = 99;
		}
		int n = 0;
		if (c1 < c2) n = c1;
		else if (c1 > c2) n = c2;
		else n = c1;
		
		cout << n << endl;
		
		cin >> a >> b;
	}
	
	return 0;
}
/* 
g++ -std=c++11 uva12468-Zapping.cpp

3 9
0 99
12 27
-1 -1

Sample Output
6
1
15
*/