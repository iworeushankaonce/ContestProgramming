#include <bits/stdc++.h>
#include <algorithm>
#include <ctype.h>
#include <unordered_map>

using namespace std;

int main ()
{
    int n;      cin >> n;
    for (int i = 0; i < n; i++)
    {
        int a;  cin >> a;
        int temp;
		int maxCouter = 0;
		int counter = 0;
        unordered_map <int, int> list;
        for (int j = 0; j < a; j++)
		{
			cin >> temp;
			if(list[temp] == 0)
			{
				counter++;
				list[temp]++;
			}
			else
			{
				maxCouter = (counter > maxCouter) ? counter : maxCouter;
				counter = 0;
				for(auto x = list.begin(); x != list.end();++x) x->second = 0;
			}
		}
		cout << list.size() << endl;
    }
	return 0;
}


