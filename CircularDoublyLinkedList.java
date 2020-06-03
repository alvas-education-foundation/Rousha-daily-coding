/*3. Write a Java Program to Implement Circular Doubly Linked List*/

import java.util.Scanner;

/* Class Node */
class Node
{
protected int data;
protected Node next, prev;

/* Constructor */
public Node()
{
next = null;
prev = null;
data = 0;
}
/* Constructor */
public Node(int d, Node n, Node p)

{
data = d;
next = n;
prev = p;
}
/* Function to set link to next node */
public void setLinkNext(Node n)
{
next = n;
}
/* Function to set link to previous node */
public void setLinkPrev(Node p)
{
prev = p;
}
/* Funtion to get link to next node */
public Node getLinkNext()
{
return next;
}
/* Function to get link to previous node */
public Node getLinkPrev()
{
return prev;
}
/* Function to set data to node */
public void setData(int d)

{
data = d;
}
/* Function to get data from node */
public int getData()
{
return data;
}
}

/* Class linkedList */
class linkedList
{
protected Node start;
protected Node end ;
public int size;

/* Constructor */
public linkedList()
{
start = null;
end = null;
size = 0;
}
/* Function to check if list is empty */
public boolean isEmpty()
{

return start == null;
}
/* Function to get size of list */
public int getSize()
{
return size;
}
/* Function to insert element at begining */
public void insertAtStart(int val)
{
Node nptr = new Node(val, null, null);
if (start == null)
{
nptr.setLinkNext(nptr);
nptr.setLinkPrev(nptr);
start = nptr;
end = start;
}
else
{
nptr.setLinkPrev(end);
end.setLinkNext(nptr);
start.setLinkPrev(nptr);
nptr.setLinkNext(start);
start = nptr;
}
size++ ;

}
/*Function to insert element at end */
public void insertAtEnd(int val)
{
Node nptr = new Node(val, null, null);
if (start == null)
{
nptr.setLinkNext(nptr);
nptr.setLinkPrev(nptr);
start = nptr;
end = start;
}
else
{
nptr.setLinkPrev(end);
end.setLinkNext(nptr);
start.setLinkPrev(nptr);
nptr.setLinkNext(start);
end = nptr;
}
size++;
}
/* Function to insert element at position */
public void insertAtPos(int val, int pos)
{
Node nptr = new Node(val, null, null);
if (pos == 1)

{
insertAtStart(val);
return;
}
Node ptr = start;
for (int i = 2; i &lt;= size; i++)
{
if (i == pos)
{
Node tmp = ptr.getLinkNext();
ptr.setLinkNext(nptr);
nptr.setLinkPrev(ptr);
nptr.setLinkNext(tmp);
tmp.setLinkPrev(nptr);
}
ptr = ptr.getLinkNext();
}
size++ ;
}
/* Function to delete node at position */
public void deleteAtPos(int pos)
{
if (pos == 1)
{
if (size == 1)
{
start = null;

end = null;
size = 0;
return;
}
start = start.getLinkNext();
start.setLinkPrev(end);
end.setLinkNext(start);
size--;
return ;
}
if (pos == size)
{
end = end.getLinkPrev();
end.setLinkNext(start);
start.setLinkPrev(end);
size-- ;
}
Node ptr = start.getLinkNext();
for (int i = 2; i &lt;= size; i++)
{
if (i == pos)
{
Node p = ptr.getLinkPrev();
Node n = ptr.getLinkNext();
p.setLinkNext(n);
n.setLinkPrev(p);
size-- ;

return;
}
ptr = ptr.getLinkNext();
}
}
/* Function to display status of list */
public void display()
{
System.out.print(&quot;\nCircular Doubly Linked List = &quot;);
Node ptr = start;
if (size == 0)
{
System.out.print(&quot;empty\n&quot;);
return;
}
if (start.getLinkNext() == start)
{
System.out.print(start.getData()+ &quot; &lt;-&gt; &quot;+ptr.getData()+ &quot;\n&quot;);
return;
}
System.out.print(start.getData()+ &quot; &lt;-&gt; &quot;);
ptr = start.getLinkNext();
while (ptr.getLinkNext() != start)
{
System.out.print(ptr.getData()+ &quot; &lt;-&gt; &quot;);
ptr = ptr.getLinkNext();
}

System.out.print(ptr.getData()+ &quot; &lt;-&gt; &quot;);
ptr = ptr.getLinkNext();
System.out.print(ptr.getData()+ &quot;\n&quot;);
}
}

/* Class CircularDoublyLinkedList */
public class Main
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
/* Creating object of linkedList */
linkedList list = new linkedList();
System.out.println(&quot;Circular Doubly Linked List Test\n&quot;);
char ch;
/* Perform list operations */
do
{
System.out.println(&quot;\nCircular Doubly Linked List Operations\n&quot;);
System.out.println(&quot;1. insert at begining&quot;);
System.out.println(&quot;2. insert at end&quot;);
System.out.println(&quot;3. insert at position&quot;);
System.out.println(&quot;4. delete at position&quot;);
System.out.println(&quot;5. check empty&quot;);
System.out.println(&quot;6. get size&quot;);
int choice = scan.nextInt();

switch (choice)
{
case 1 :
System.out.println(&quot;Enter integer element to insert&quot;);
list.insertAtStart( scan.nextInt() );
break;
case 2 :
System.out.println(&quot;Enter integer element to insert&quot;);
list.insertAtEnd( scan.nextInt() );
break;
case 3 :
System.out.println(&quot;Enter integer element to insert&quot;);
int num = scan.nextInt() ;
System.out.println(&quot;Enter position&quot;);
int pos = scan.nextInt() ;
if (pos &lt; 1 || pos &gt; list.getSize() )
System.out.println(&quot;Invalid position\n&quot;);
else
list.insertAtPos(num, pos);
break;
case 4 :
System.out.println(&quot;Enter position&quot;);
int p = scan.nextInt() ;
if (p &lt; 1 || p &gt; list.getSize() )
System.out.println(&quot;Invalid position\n&quot;);
else
list.deleteAtPos(p);

break;
case 5 :
System.out.println(&quot;Empty status = &quot;+ list.isEmpty());
break;
case 6 :
System.out.println(&quot;Size = &quot;+ list.getSize() +&quot;\n&quot;);
break;
default :
System.out.println(&quot;Wrong Entry\n &quot;);
break;
}
/* Display List */
list.display();
System.out.println(&quot;\nDo you want to continue (Type y or n)\n&quot;);
ch = scan.next().charAt(0);
}
while (ch == &#39;Y&#39;|| ch == &#39;y&#39;);
}
}
