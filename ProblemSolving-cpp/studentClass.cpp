#include <iostream>
#include <sstream>
using namespace std;



class Student
{
private:
    int age;
    int standard;
    string firstname;
    string lastname;

    
  public:
    int get_standard(){
        return this->standard;
    }
    void set_standard(int standard){
        this->standard = standard;
    }
    
    void set_age(int age){
        this->age = age;
    }
    int get_age(){return age;}
    
    void set_first_name(string first_name){
        this->firstname = first_name;
    }
    string get_first_name(){
        return firstname;
    }
    
    void set_last_name(string last_name){
        this->lastname = last_name;
    }
    string get_last_name(){return lastname;} 
    
    string to_string(){
        return std::to_string(age)+","+firstname+","+lastname+","+std::to_string(standard); 
    } 
};
/*
Enter code for class Student here.
Read statement for specification.
*/

int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}