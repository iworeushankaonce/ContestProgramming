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
		int mile = 0;
		int juice = 0;
		for(int i = 0; i < n; ++i)
		{
			int a = 0;
			cin >> a;
			mile += (a / 30 + 1) * 10;
			juice += (a / 60 + 1) * 15;
		}
		cout << "Case " << (cas + 1) << ": ";
		if (mile < juice)
		{
			cout << "Mile " << mile << endl;
		}
		else if(mile > juice)
		{
			cout << "Juice " << juice << endl;
		}
		else
		{
			cout << "Mile Juice " << mile << endl;
		}
	}
	
	return 0;
}
// g++ -std=c++11 uva12157-Tariff_Plan.cpp

/*

3
2
61 10
3
40 40 40
2
60 65

Sample Output
Case 1: Mile 40
Case 2: Juice 45
Case 3: Mile Juice 60
*/