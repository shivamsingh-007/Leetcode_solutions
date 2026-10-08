impl Solution {
    pub fn remove_outer_parentheses(s: String) -> String {
        let mut p = 0;
        s.chars().filter_map(|c| {
            if c == '(' {
                p+=1;
                if p > 1 {
                    Some(c)
                } else {
                    None
                }
            } else {
                p-=1;
                if p > 0 {
                    Some(c)
                } else {
                    None
                }
            }
        }).collect::<String>()
    }
}