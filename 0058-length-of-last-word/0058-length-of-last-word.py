class Solution(object):
    def lengthOfLastWord(self, s):
        s = s.strip()          # remove leading and trailing spaces
        words = s.split()     # split by spaces
        return len(words[-1]) # length of last word
