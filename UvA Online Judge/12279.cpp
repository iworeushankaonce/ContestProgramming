#include<iostream>

using namespace std;

int main(){
	
	int n;
	cin >> n;
	int count = 1;
	while(n != 0){
		int a;
		int total = 0;
		
		for(int i = 0;i<n;++i){
		
		cin >> a;
		 if(a == 0){
			--total;
		} else{
			++total;
			}
		}
		cout << "Case "<< count++ <<": " << total << endl;
		cin >> n;
	}
	return 0;
}