//Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
//
//You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
//
//Example:
//Given 1->2->3->4->5->NULL,
//return 1->3->5->2->4->NULL.
//
//Note:
//The relative order inside both the even and odd groups should remain as it was in the input. 
//The first node is considered odd, the second node even and so on ...
//
//Credits:
//Special thanks to @DjangoUnchained for adding this problem and creating all test cases.
#include<windows.h>
#include<iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
 
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
		if(head==NULL||head->next==NULL)return head;
		ListNode*odd=head;
		ListNode*even=head->next;
		ListNode*p=odd;
		ListNode*q=even;
		ListNode*r=head->next->next;
		int cnt=1;
		while(r!=NULL){
			if(cnt&1){
				p->next=r;
				p=p->next;
			}
			else{
				q->next=r;
				q=q->next;
			}
			r=r->next;
			cnt++;
		}
		q->next=NULL;
		p->next=even;
		return odd;
    }
};
int main(){
	Solution test=Solution();
	ListNode*head=new ListNode(1);
	ListNode*p=head;
	p->next=new ListNode(2);
	p=p->next;
	p->next=new ListNode(3);
	p=p->next;
	p->next=new ListNode(4);
	p=p->next;
	p->next=new ListNode(5);
	p=test.oddEvenList(head);
	while(p!=NULL){
		cout<<p->val<<" ";
		p=p->next;
	}
	cout<<endl;
	system("pause");
	return 0;
}