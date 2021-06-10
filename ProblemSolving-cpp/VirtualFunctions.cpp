#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int student_id = 1, prof_id = 1;
class Person{
    public:
        string name;
        int age;
    virtual void getdata(){cin>>name>>age;}
    virtual void putdata(){cout<<name<<age<<endl;}
    Person(){}
    ~Person(){}
        
};
class Student: public Person{
    private:
        int cur_id;
        int marks[6];
    public:
        void getdata(){
            cin>>name>>age>>marks[0]>>marks[1]>>marks[2]>>marks[3]>>marks[4]>>marks[5];
        } 
        void putdata(){
            cout<<name<<" "<<age<<" "<<marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5]<<" "<<cur_id<<endl;
        }
    Student(){
        cur_id =student_id++;
    }
    ~Student(){}
};

class Professor: public Person{
    private:
        int cur_id;
        int pubs;
    public:
        void getdata(){
            cin>>name>>age>>pubs;
        } 
        void putdata(){
            cout<<name<<" "<<age<<" "<<pubs<<" "<<cur_id<<endl;
        }
    Professor(){
        cur_id = prof_id++;
    }
    ~Professor(){}
};

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
