package edu.cdu.xeon.sprint3.s294831.task3.after;

public class Proxy {
  class OriginalNumbers
{
int n_id;
public:
OriginalNumbers(int i)
{
n_id = i;
cout << " $$ ctor: " << n_id << '\n';
}
~OriginalNumbers()
{
cout << " dtor: " << n_id << '\n';
}
void Display()
{
cout << " Number increment" << n_id << '\n';
}
};

// 1. Design an "extra level of indirection" wrapper class
class Numbers
{
// 2. The wrapper class holds a pointer to the real class
OriginalNumbers *n_the_original_thing;
int n_id;
static int n_next;
public:
Numbers()
{
n_id = n_next++;
// 3. Initialized to null
n_the_otiginal_thing = 0;
}
~Image()
{
delete n_the_original_thing;
}
void display()
{
// 4. When a request comes in, the real object is
// created "on first use"
if (!n_the_original_thing)
n_the_original_thing = new OriginalNumbers(n_id);
// 5. The request is always delegated
m_the_real_thing->display();
}
};
int Numbers ::n_next = 1;

int main()
{
Int Numbers [5];

for (int i; true;)
{
cout << "Exit[0], Numbers[1-5]: ";
cin >> i;
if (i == 0)
break;
Numbers[i - 1].print();
}
}



}
