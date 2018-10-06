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
	int b; int n;
	while(cin >> b >> n)
	{
		if (b == 0 and n == 0) break;
		int bank[b];
		
		for (int i = 0; i < b; i++)
		{
			cin >> bank[i];
		}
		for (int i = 0; i < n; i++)
		{
			int d; int c; int v;
			cin >> d >> c >> v;
			d--;
			c--;
			bank[d] -= v;
			bank[c] += v;
		}
		bool possible = true;
		for (int i = 0; i < b; ++i)
		{
			if (bank[i] < 0)
			{
				possible = false;
				break;
			}
		}
		cout << (possible ? "S" : "N") << endl;
	}
	
	
	return 0;
}
// g++ -std=c++11 11679-Sub-prime.cpp

/*

3 3
1 1 1
1 2 1
2 3 2
3 1 3
3 3
1 1 1
1 2 1
2 3 2
3 1 4
3 3
1 1 1
1 2 2
2 3 2
3 1 2
0 0
Sample Output
S
N
S
*/