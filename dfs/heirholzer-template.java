class N{
    N n;
    ValueType v;
    N(ValueType v){
        this.v = v;
    }
}
class LL{
    N h, t;
    LL(ValueType v){
        N n = new N(v);
        h = n;
        t = n;
    }
}

void main(){
    LL ll = new LL(startValue);
    dfs(ll);
    N head = ll.h;
    while(head != null){
        collectValue(h.v);
        h = h.n;
    }
    return collectedValues;
}

void dfs(LL ll){ // heirholzer
    String from = ll.t.v;
    ListType listOfNexts = getNextsFor(from);
    if(listOfNexts == null || listOfNexts.isEmpty()) return;
    LL end = new LL(listOfNexts.next());
    dfs(end);
    while(!listOfNexts.isEmpty()){ // internal loops
        N n = new N(listOfNexts.next());
        ll.t.n =n;
        ll.t = n;
        dfs(ll);
    }
    ll.t.n = end.h;
    ll.t = end.t;
}
