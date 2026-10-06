impl Solution {
    pub fn min_add_to_make_valid(s: String) -> i32 {
        s.chars().fold(vec!(), |mut stack, item| {
            if item == '(' {
                stack.push(item);
            } else {
                if let Some('(') = stack.last() {
                    stack.pop();
                } else {
                    stack.push(item);
                }
            }
            stack
        }).len() as i32
    }
}