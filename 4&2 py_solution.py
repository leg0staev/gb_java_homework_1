
# def my_prime(max_number: int):
#     for i in range(2, max_number):
#         for j in range(2, i+1):
#             if i % j != 0:
#                 continue
#             if j == i:
#                 print(i)
#             else:
#                 break


# print(my_prime(1000))

#          0 1 2  3  4
string = '2? + ?5 = 63'


def varibale_num(strange_num: str) -> int:  # '2?'
    for i in range(10):
        option_num = ''
        for char in strange_num:
            if char == '?':
                option_num += str(i)
            else:
                option_num += char
        yield int(option_num)


def find_lost_digit(polynom: str) -> str:
    poly_list = polynom.split()  # ['2?', '+', '?5', '=', '69']
    first_member_gen = varibale_num(poly_list[0])

    for x in first_member_gen:
        second_member_gen = varibale_num(poly_list[2])
        for y in second_member_gen:
            if x + y == int(poly_list[4]):
                return f'{x} + {y} = {poly_list[4]}'
            continue
    return 'no solution'


print(find_lost_digit(string))

# # my_generator = varibale_num('22')

# for i in my_generator:
#     print(i)
