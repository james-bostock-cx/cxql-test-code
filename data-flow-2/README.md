# Introduction

This directory contains three files which provide a trivial example of
a typical three-tier application.

# Sample CxQL Queries

## Flows from Input to Output

The following query derives a flow from the input request parameter
through to the invocation of the ~info~ method:

```
CxList inputs = All.FindByShortName("request").FindByType(typeof(ParamDecl));
CxList outputs = All.FindByShortName("info").FindByType(typeof(MethodInvokeExpr));
CxList flows = inputs.InfluencingOn(outputs);
result = flows;
```

The following, more general, query will derive two flows, one a sub-flow of the other:

```
CxList inputs = All.FindByShortName("request");
CxList outputs = All.FindByShortName("info");
CxList flows = inputs.InfluencingOn(outputs);
result = flows;
```

Note that the first line returns three nodes but only two of them, the
ones of type `ParamDecl` and `UnknownReference`, are part of the data
flows. The third, of type `Param`, is not part of the data flows.
