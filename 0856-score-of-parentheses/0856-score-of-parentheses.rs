impl Solution {
    pub fn score_of_parentheses(s: String) -> i32 {
        let mut score_stack = vec![0];

        for ch in s.chars() {
            if ch == '(' {
                score_stack.push(0);
            } else {
                let last_score = score_stack.pop().unwrap();
                let added_score = if last_score == 0 { 1 } else { last_score * 2 };
                *score_stack.last_mut().unwrap() += added_score;
            }
        }

        score_stack[0]
    }
}