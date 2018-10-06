 #include<iostream>
 
 using namespace std;
 
 int main() {
	 
	 int t;
	 cin >> t;
	 
	 for(int i = 0;i< t;++i){
		
			int calls;
			cin >> calls;
			
			int totalM = 0;
			int totalJ = 0;
			
			for(int j = 0; j < calls; j++){
					int dur;
					cin >> dur;
					
					int M = (dur/30 + 1) * 10;
					int J = (dur/60 + 1) * 15;
					
					totalM+=M;
					totalJ+=J;
			}
			
			if(totalM < totalJ){
				
				cout << "Case "<< (i+1) << ": Mile " << totalM << "\n";
					
			}else 
				if(totalM > totalJ){
				
				cout << "Case "<< (i+1) << ": Juice " << totalJ << "\n";
					
			} else {
				
				cout << "Case "<< (i+1) << ": Mile Juice " << totalM << "\n";
					
			}
	 }
	return 0;
 }