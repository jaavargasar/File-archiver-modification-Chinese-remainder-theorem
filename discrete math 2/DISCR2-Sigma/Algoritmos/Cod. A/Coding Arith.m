
counts = [1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 ];
vector1 = [0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01 0.01  0.01 0.02 0.02 0.02 0.02];

for i=1 : 29,
len = i + 1;
seq = randsrc(1,len,[1:96;vector1]);

code = arithenco(seq,counts);
s = (size(code)); 
s = s(2);
result = int32((s/8));
x = sprintf('%d* is converted in %d', len , result );
disp(x);
end
for i=1 : 100,
len =  10*i;
seq = randsrc(1,len,[1:96;vector1]);

code = arithenco(seq,counts);
s = (size(code)); 
s = s(2);
result = int32((s/8));
x = sprintf('%d* is converted in %d', len , result );
disp(x);
end