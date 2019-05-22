package array;

import java.util.ArrayList;

public class Insert {
    private boolean inbetween(int mn, int mx, int num) {
        return (num <= mx && num >= mn);
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort((x, y) -> {
            if (x.start < y.start) return -1;
            if (x.start > y.start) return 1;
            if (x.end < y.end) return -1;
            if (x.end > y.end) return 1;
            return 0;
        });

        ArrayList<Interval> res = new ArrayList<>();

        int l = intervals.get(0).start;
        int r = intervals.get(0).end;

        for (int i = 1 ; i < intervals.size(); i++) {
            if (inbetween(l, r, intervals.get(i).start) ||
                    inbetween(l, r, intervals.get(i).end)) {
                r = Math.max(r, intervals.get(i).end);
                continue;
            }

            res.add(new Interval(l , r));
            l = intervals.get(i).start;
            r = intervals.get(i).end;
        }
        res.add(new Interval(l , r));
        return res;
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);

        return merge(intervals);
    }
}
