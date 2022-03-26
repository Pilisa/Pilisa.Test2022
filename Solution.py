
# The code is not correct because of the use of incorrect indentation,Solution is also not defined
# In terms of effeciency the code is not too bad because there are no too much bugs in the code because the number of bugs is four
# The coding style of this student is plain and simple because I am able to read and understand thye code as the reviewer
# The student did not document the code 

class Solution:
   def groupAnagrams(self, strs):
      result = {}
      for i in strs:
         x = "".join(sorted(i))
         if x in result:
            result[x].append(i)
         else:
            result[x] = [i]
      return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))