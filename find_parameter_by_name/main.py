# test code for FindParameterByName atomic query.
def foo(name, role):
    print(f'{name}: {role}')

# result = All.FindByParameterName(:name")
# does _not_ return anything for the following line
foo("Joe", "Unknown")
# but does return the following method invocation
foo(role="admin", name="Jane")
