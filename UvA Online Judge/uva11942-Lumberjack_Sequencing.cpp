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
	cout << "Lumberjacks:" << endl;
	for(int cas = 0; cas < cases; ++cas)
	{
		int a[10];
		for(int i = 0; i < 10; ++i)
		{
			cin >> a[i];
		}
		bool ordered = true;
		if (a[0] < a[1])
		{
			for (int i = 1; i < 10; ++ i)
			{
				if (a[i - 1] >= a[i])
				{
					ordered = false;
					break;
				}
			}
		}
		else if (a[0] > a[1])
		{
			for (int i = 1; i < 10; ++ i)
			{
				if (a[i - 1] <= a[i])
				{
					ordered = false;
					break;
				}
			}
		}
		cout << (ordered ? "Ordered" : "Unordered") << endl;
		
	}
	
	return 0;
}
// g++ -std=c++11 uva111942-Lumberjack_Sequencing.cpp

/*

3
13 25 39 40 55 62 68 77 88 95
88 62 77 20 40 10 99 56 45 36
91 78 61 59 54 49 43 33 26 18

Sample Output
Lumberjacks:
Ordered
Unordered
Ordered

*/