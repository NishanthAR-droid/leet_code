class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n,h = len(needle), len(haystack)
        
        for i in range(h - n + 1):
            if needle == haystack[i : i + n]:
                return i

        return -1