impl Solution {
    pub fn min_insertions(s: String) -> i32 {
        let mut iterator = s.chars().peekable();
        let mut counter = 0;
        let mut res = 0;

        while let Some(c) = iterator.next() {
            if c == '(' {
                counter += 2;
            } else {
                if iterator.peek() != Some(&')') { res += 1; }
                else { iterator.next(); }

                if counter == 0 { res += 1; }
                else  { counter -= 2; }
            }
        }
        res + counter
    }
}
