class Solution:
    def calculate(self, s):
        stack = []
        ans = 0
        num = 0
        sign = 1

        for ch in s:
            if ch.isdigit():
                num = num * 10 + int(ch)

            elif ch == '+':
                ans += sign * num
                num = 0
                sign = 1

            elif ch == '-':
                ans += sign * num
                num = 0
                sign = -1

            elif ch == '(':
                stack.append(ans)
                stack.append(sign)
                ans = 0
                num = 0
                sign = 1

            elif ch == ')':
                ans += sign * num
                num = 0

                prev_sign = stack.pop()
                prev_ans = stack.pop()

                ans = prev_ans + prev_sign * ans

        ans += sign * num
        return ans