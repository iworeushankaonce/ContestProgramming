#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
using namespace std;

int makeCombination();

int main() {
	int n;
	map<int, int> mymap;

    while(cin >> n) 
	{
		if(n == 0) break;
		for(int i=0; i < n; i++) {
			int combination = makeCombination();
			++mymap[combination];
		}
		
		int maxVal = 0; //ниже нахоим наибольшую популярность
		
		for(auto it = mymap.begin(); it != mymap.end(); ++it) 
		{
			maxVal =(maxVal > it->second) ? maxVal : it->second;	
		}
	
		
		//теперь находим кол-во популярных курсов
		int counter = 0;
		for(auto it = mymap.begin(); it != mymap.end(); ++it) 
		{
			if(it->second == maxVal) counter++;
		}
		
		cout << maxVal * counter << endl; //получаем кол-во студентов
		mymap.clear();
    }
	return 0;
}

int makeCombination()
{
	int combination = 0;
	vector<int> v(5);
	for(int i = 0; i < 5; ++i) cin >> v[i];
	sort(v.begin(), v.end());
	for(int x: v)
	{
		combination += x;
		combination *=1000;
	}
	return combination;
}