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
	int n, b, h, w;
	while(cin >> n >> b >> h >> w)
	{
		int p[h];
		int a[h][w];
		for(int i = 0; i < h; ++i)
		{
			cin >> p[i];
			for(int j = 0; j < w; ++j)
			{
				cin >> a[i][j];
			}
		}
		vector <int> r;
		for(int i = 0; i < h; ++i)
		{
			for(int j = 0; j < w; ++j)
			{
				if(a[i][j] >= n)
				{	
					r.push_back(p[i] * n);
					break;
				}
			}
		}
		if (r.size() != 0)
		{
			auto minim = min_element(r.begin(), r.end());
			int min = *minim;
			if (min <= b)
				cout << min << endl;
			else 
				cout << "stay home" << endl;
		}
		else 
		{
			cout << "stay home" << endl;
		}
		
	}
	
	return 0;
}
// g++ -std=c++11 11559-Event_Planning.cpp

/*

3 1000 2 3
200
0 2 2
300
27 3 20
5 2000 2 4
300
4 3 0 4
450
7 8 0 13

Sample Output
900
stay home
*/