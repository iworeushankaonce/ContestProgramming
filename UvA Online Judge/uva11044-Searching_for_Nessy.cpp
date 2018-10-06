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
		int a; cin >> a;
		int b; cin >> b;
		a -= 2;
		b -= 2;
		if(a % 3 == 0)
		{
			a /= 3;
		}
		else
		{
			a /= 3;
			a++;
		}
		
		if(b % 3 == 0)
		{
			b /= 3;
		}
		else
		{
			b /= 3;
			b++;
		}
		int r = a * b;
		cout << r << endl;
	}
	
	return 0;
}
// g++ -std=c++11 11044-Searching_for_Nessy.cpp

/*

3
6 6
7 7
9 13
Sample Output
4
4
12
*/