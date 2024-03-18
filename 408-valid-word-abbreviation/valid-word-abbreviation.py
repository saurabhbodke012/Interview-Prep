class Solution:
    def validWordAbbreviation(self, word: str, abbr: str) -> bool:
        count=0
        sub_length = 0
        for ch in abbr:
            if ch.isdigit():
                digit=int(ch)
                if digit==0 and sub_length==0:
                    return False
                else:
                    sub_length=sub_length*10+digit
            else:
                count+=sub_length
                count+=1
                if count>len(word) or ch!=word[count-1]:
                    return False
                sub_length=0
        
        return len(word)==count+sub_length