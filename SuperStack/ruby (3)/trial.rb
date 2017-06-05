

# Complete the function below.
def superStack(operations) 
	ns = []
	for op in operations
		command,e,k=op.split(" ")
		if command == "pop"
			ns.delete_at(ns.length - 1)
		elsif command == "push"
			ns.push(e.to_i)
		elsif command == "inc"
			for i in 0..e.to_i-1
				ns[i] += k.to_i
			end
		end
		puts ns.length > 0 ? ns[ns.length - 1] : "EMPTY" 
	end
end

# DO NOT MODIFY THE CODE BELOW THIS LINE! 
operations_cnt = Integer(gets)
operations = Array.new(operations_cnt)
operations_i = 0
while (operations_i < operations_cnt)
  operations_item = gets.to_s.strip;
  operations[operations_i] = (operations_item)
  operations_i+=1
end

superStack(operations);

