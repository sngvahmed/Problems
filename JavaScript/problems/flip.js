const problem = { 
    //param A : string
    //return a array of integers
    flip : function(A){
        var li = 0, ri = 0;
        var l = 0, r = 0;

        var cur_mx = (A[0] == '1') ? -1 : 1;
        var r_mx = (A[0] == '1') ? -1 : 1;

        for (var i = 1; i < A.length; i++) {
            var v = (A[i] == '1') ? -1 : 1;

            if (cur_mx + v >= v) {
                r = i;
                cur_mx += v;
            } else {
                cur_mx = v;
                l = i;
                r = i;
            }

            if (r_mx < cur_mx) {
                r_mx = cur_mx;
                li = l;
                ri = r;
            }
        }

        return r_mx == -1 ? [] : [li + 1, ri + 1];
    }
}

// console.log(problem.flip("010"))

module.exports = problem;

