impl Solution {
    pub fn longest_valid_parentheses(s: String) -> i32 {
        let mut v = vec![-1];
        
        s.bytes().enumerate().map(|(i, b)| {
            if b == b'(' {
                v.push(i as i32);
                0
            } else {
                v.pop();
                if v.is_empty() {
                    v.push(i as i32);
                    0
                } else {
                    i as i32 - v.last().unwrap()
                }
            }
        }).max().unwrap_or(0)
    }
}
