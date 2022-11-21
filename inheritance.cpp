#include<iostream>
using namespace std;
	class Gourav{
	public:
		void myFun(){
			cout << " Hello ";
		}
	};
	 class Divyaa : public Gourav{
			// cout << "Hello DIvya";
	};

	int main(){
	Divyaa d;
	d.myFun();
}

// #include<iostream>
// using namespace std;
// class student{
// 	public:
// 		int a=10;
// };
// int main()
// {
// 	cout<<"Divya";
// 	student st;
// 	cout << st.a;
// }
