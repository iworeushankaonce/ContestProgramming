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
		int n; cin >> n;
		int a[n];
		for (int i = 0; i < n; ++i)
		{
			int x, y;
			cin >> x >> y;
			int c = 0;
			while (x != y)
			{
				x--;
				c++;
			}
			a[i] = c;
		}
		bool yes = true;
		for (int i = 0; i < n - 1; ++i)
		{
			if(a[i] != a[i+1])
			{
				yes = false;
				break;
			}
		}
		cout << (yes ? "yes" : "no") << endl;
		if (cas < cases - 1)
			cout << endl;
	}
	
	return 0;
}
// g++ -std=c++11 10963-The_Swallowing_Ground.cpp

/*

3
5
2 1
0 -1
1 0
1 0
2 1

5
-1 -2
-1 -2
-1 -2
1 0
-1 -3

3
90 -100
90 -100
40 -50

Sample Output
yes
no




*/