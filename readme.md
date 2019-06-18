Very simple setup running cloud gateway.

This currently does two things
 - forwarding via path
 - forwarding via host

To try:
- Append hosts to your hosts file
- Run all 3 spring boot apps
- curl localhost/seagull
- curl localhost/parrot/hello
- curl parrot.com
- curl seagull

Forwarding examples:
localhost/seagull -> localhost:8282

localhost/parrot/abc -> localhost:8181/abc

seagull.com -> localhost:8282

parrot.com/abc -> localhost:8181/abc
