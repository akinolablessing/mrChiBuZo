def largest_element(numbers:list)->int:
	largest = numbers[0]
	for number in numbers:
		if largest < number:
			largest = number
		print(largest)
		return largest

numbers = [5,6,66,10,48]
largest_element(numbers)		
			
				
	