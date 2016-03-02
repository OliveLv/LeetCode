/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head==NULL)return head;
        ListNode* root=new ListNode(0);
        ListNode* p=head;
        while(p!=NULL){
            ListNode*q=p->next;
            p->next=root->next;
            root->next=p;
            p=q;
        }
        return root->next;
    }
};
