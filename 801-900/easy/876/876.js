/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
    let curr=head;
    let currNode=head;
    let count=0;
    while(curr){
        curr=curr.next
        count+=1;
    }
    let mid=count%2!=0?Math.ceil(count/2):Math.floor(count/2)+1
    for(let i=0;i<mid-1;i++){
        currNode=currNode.next
    }
    return currNode;
};
