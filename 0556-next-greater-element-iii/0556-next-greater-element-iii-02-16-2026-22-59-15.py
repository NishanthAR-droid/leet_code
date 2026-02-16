class Solution:
    def nextGreaterElement(self, n: int) -> int:
        digits = list(str(n))

        p = len(digits)-2

        while p > -1:
            if digits [p] < digits[p+1]:
                break
            p-=1

        if p>-1:
            for i in range(len(digits)-1, p, -1):
                if digits[i]>digits[p]:
                    digits[p], digits[i] = digits[i], digits[p]
                    break

        digits[p+1:] = reversed(digits[p+1:])

        num = int("".join(digits))

        if num <= n or num > ((2**31)-1):
            return -1

        return num    