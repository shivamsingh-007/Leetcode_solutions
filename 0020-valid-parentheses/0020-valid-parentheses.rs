impl Solution {
    pub fn is_valid(s: String) -> bool {
        s.bytes()
            .try_fold(Vec::with_capacity(s.len()), |mut f, b| {
                match b {
                    b'{' | b'[' => f.push(b + 2),
                    b'(' => f.push(b + 1),
                    _ => {
                        if f.pop() != Some(b) {
                            return None;
                        }
                    }
                }
                Some(f)
            })
            .is_some_and(|f| f.is_empty())
    }
}