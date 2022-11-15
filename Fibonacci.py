n = 5
# n: 수열에서 n번째 값을 구하는 것이 목표

nums = [0]*n
# nums: 값을 DP 방식으로 구하기 위한 배열

# 1,2번째 값은 1로 설정
nums[0] = 1
nums[1] = 1  

# 앞의 두 값을 계속 더해나감
for i in range(2,n):  
    nums[i] = nums[i-1] + nums[i-2]

print('수열의 n번째 값: ', nums[n-1])

