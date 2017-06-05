def getMap(s)
    m = {}
    for i in 0..s.length
        c = s[i]
        v = m[c];
        if ( v == nil)
            v = 0
        end
        v++
        m[c] = v
    end
    return m
end

def count(m1,m2)
    sum = 0;
    m1.each do |s, v|
        v1 = m1[s]
        v2 = m2[s] || 0
        puts v1," ",v2
        sum += [0, v1-v2].max
    end
    return sum
end
# Complete the function below.
def getMinimumDifference(a, b)
    arr = []
    for i in 0..a.length-1
        if (a[i].length != b[i].length)
            arr.push(-1);
            
        elsif (a[i].length == 0)
            arr.push(0);
            
        else 
            m1 = getMap(a[i])
            m2 = getMap(b[i])
            puts count(m1,m2)
            puts count(m2,m1)
            arr.push([count(m1, m2), count(m2, m1)].max)
        end
    end
    return arr;
end
 

# DO NOT MODIFY THE CODE BELOW THIS LINE!
_a_cnt = Integer(gets)
_a_i=0
_a = Array.new(_a_cnt)

while (_a_i < _a_cnt)
  _a_item = gets.to_s.strip;
  _a[_a_i] = (_a_item)
  _a_i+=1
end

_b_cnt = Integer(gets)
_b_i=0
_b = Array.new(_b_cnt)

while (_b_i < _b_cnt)
  _b_item = gets.to_s.strip;
  _b[_b_i] = (_b_item)
  _b_i+=1
end

res = getMinimumDifference(_a, _b);
for res_i in res do
  puts res_i
end
