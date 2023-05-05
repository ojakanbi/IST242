import json

with open('/Users/ojakanbi/Desktop/Customer2/Customer/Customer.json', 'r') as f:
    json_str = f.read()
    data = json.loads(json_str)

for customer in data:
    print("Name: {} {}".format(customer['firstName'], customer['lastName']))
    print("Phone: {}".format(customer['phoneNumber']))
    print("Email: {}".format(customer['email']))
    print("State: {}".format(customer['address']))
