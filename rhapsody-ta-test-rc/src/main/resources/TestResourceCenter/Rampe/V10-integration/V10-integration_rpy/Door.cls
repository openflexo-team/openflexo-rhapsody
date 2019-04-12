I-Logix-RPY-Archive version 8.12.0 Java 9728113
{ IClass 
	- _id = GUID dab67241-192c-4d77-be97-e79751495898;
	- _myState = 8192;
	- _properties = { IPropertyContainer 
		- Subjects = { IRPYRawContainer 
			- size = 1;
			- value = 
			{ IPropertySubject 
				- _Name = "CG";
				- Metaclasses = { IRPYRawContainer 
					- size = 1;
					- value = 
					{ IPropertyMetaclass 
						- _Name = "Class";
						- Properties = { IRPYRawContainer 
							- size = 1;
							- value = 
							{ IProperty 
								- _Name = "Concurrency";
								- _Value = "active";
								- _Type = Enum;
								- _ExtraTypeInfo = "sequential,active";
							}
						}
					}
				}
			}
		}
	}
	- _name = "Door";
	- Dependencies = { IRPYRawContainer 
		- size = 0;
	}
	- Stereotypes = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IHandle 
			- _m2Class = "IStereotype";
			- _filename = "$OMROOT\\Profiles\\SysML\\SysMLProfile_rpy\\SysML.sbs";
			- _subsystem = "SysML::Blocks";
			- _class = "";
			- _name = "Block";
			- _id = GUID f685432f-691e-4ff1-be70-4d09d19457e1;
		}
	}
	- _modifiedTimeWeak = 9.13.2017::17:35:12;
	- _theMainDiagram = { IHandle 
		- _m2Class = "IDiagram";
		- _filename = "";
		- _subsystem = "";
		- _class = "";
		- _name = "Model1";
		- _id = GUID db377331-31bb-46d7-956b-d9f60698e2cf;
	}
	- _lastID = 5;
	- weakCGTime = 9.13.2017::17:35:12;
	- strongCGTime = 9.6.2017::11:47:51;
	- Ports = { IRPYRawContainer 
		- size = 3;
		- value = 
		{ IPort 
			- _id = GUID bb1e8d7c-7e44-4d69-a62e-5db0f8a4dc66;
			- _myState = 8192;
			- _name = "open";
			- _modifiedTimeWeak = 9.6.2017::11:47:10;
			- _multiplicity = "1";
			- _otherClass = { IClassifierHandle 
				- _m2Class = "IClass";
				- _id = GUID c8a33409-bef1-454c-8e7c-cca29ef54cfd;
			}
			- _inverse = { IHandle 
				- _m2Class = "";
			}
			- _implicitClass = { IClass 
				- _id = GUID c8a33409-bef1-454c-8e7c-cca29ef54cfd;
				- _myState = 10240;
				- _name = "open_implicitContract";
				- Stereotypes = { IRPYRawContainer 
					- size = 1;
					- value = 
					{ IHandle 
						- _m2Class = "IStereotype";
						- _filename = "PredefinedTypes.sbs";
						- _subsystem = "PredefinedTypes";
						- _class = "";
						- _name = "Interface";
						- _id = GUID 2a7b8a63-f54f-4379-bab0-02800a5084e1;
					}
				}
				- _modifiedTimeWeak = 9.6.2017::11:47:10;
				- weakCGTime = 9.6.2017::11:47:10;
				- strongCGTime = 9.6.2017::11:47:10;
				- _multiplicity = "";
				- _itsStateChart = { IHandle 
					- _m2Class = "";
				}
				- _classModifier = Unspecified;
			}
		}
		{ IPort 
			- _id = GUID 46f7fd07-3a1a-4f50-93dd-98360d5bb5a6;
			- _myState = 8192;
			- _name = "close";
			- _modifiedTimeWeak = 9.6.2017::11:47:22;
			- _multiplicity = "1";
			- _otherClass = { IClassifierHandle 
				- _m2Class = "IClass";
				- _id = GUID d1576911-97db-44ef-9a59-2db7180ee809;
			}
			- _inverse = { IHandle 
				- _m2Class = "";
			}
			- _implicitClass = { IClass 
				- _id = GUID d1576911-97db-44ef-9a59-2db7180ee809;
				- _myState = 10240;
				- _name = "close_implicitContract";
				- Stereotypes = { IRPYRawContainer 
					- size = 1;
					- value = 
					{ IHandle 
						- _m2Class = "IStereotype";
						- _filename = "PredefinedTypes.sbs";
						- _subsystem = "PredefinedTypes";
						- _class = "";
						- _name = "Interface";
						- _id = GUID 2a7b8a63-f54f-4379-bab0-02800a5084e1;
					}
				}
				- _modifiedTimeWeak = 9.6.2017::11:47:22;
				- weakCGTime = 9.6.2017::11:47:22;
				- strongCGTime = 9.6.2017::11:47:22;
				- _multiplicity = "";
				- _itsStateChart = { IHandle 
					- _m2Class = "";
				}
				- _classModifier = Unspecified;
			}
		}
		{ IPort 
			- _id = GUID 04b012f4-c7ea-4d23-b095-28fa96563bd6;
			- _myState = 8192;
			- _name = "lock";
			- _modifiedTimeWeak = 9.6.2017::11:47:32;
			- _multiplicity = "1";
			- _otherClass = { IClassifierHandle 
				- _m2Class = "IClass";
				- _id = GUID d261fed1-4960-4258-8c6b-3605f5d995e7;
			}
			- _inverse = { IHandle 
				- _m2Class = "";
			}
			- _implicitClass = { IClass 
				- _id = GUID d261fed1-4960-4258-8c6b-3605f5d995e7;
				- _myState = 10240;
				- _name = "lock_implicitContract";
				- Stereotypes = { IRPYRawContainer 
					- size = 1;
					- value = 
					{ IHandle 
						- _m2Class = "IStereotype";
						- _filename = "PredefinedTypes.sbs";
						- _subsystem = "PredefinedTypes";
						- _class = "";
						- _name = "Interface";
						- _id = GUID 2a7b8a63-f54f-4379-bab0-02800a5084e1;
					}
				}
				- _modifiedTimeWeak = 9.6.2017::11:47:32;
				- weakCGTime = 9.6.2017::11:47:32;
				- strongCGTime = 9.6.2017::11:47:32;
				- _multiplicity = "";
				- _itsStateChart = { IHandle 
					- _m2Class = "";
				}
				- _classModifier = Unspecified;
			}
		}
	}
	- Operations = { IRPYRawContainer 
		- size = 7;
		- value = 
		{ IReception 
			- _id = GUID 3923653a-ba9f-47ed-9ea2-2ba036d4cdcc;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtInterrupt()";
				- _id = GUID 85cf1c66-8358-46fa-b5e8-282e50ab9e66;
			}
		}
		{ IReception 
			- _id = GUID baed676e-798f-4413-8a75-88bbe865e06f;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtCloseDoor()";
				- _id = GUID 6bc8bec4-1796-4259-974f-38a1b361efe0;
			}
		}
		{ IReception 
			- _id = GUID d7918bea-ce77-4ec3-acef-7e1fe262507e;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtOpenDoor()";
				- _id = GUID 957f8c4c-efff-40f3-8908-e0bbede055b1;
			}
		}
		{ IReception 
			- _id = GUID b6eb9686-2282-44a0-98b8-461764db276c;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtLocked()";
				- _id = GUID 77ec7e25-aea9-442a-b73e-2f81408bb164;
			}
		}
		{ IReception 
			- _id = GUID 0d84ecbb-4cf0-4291-b42a-99e78450f8f7;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtUnlocked()";
				- _id = GUID a3991b50-5ed7-4365-9d94-15664985ff55;
			}
		}
		{ IReception 
			- _id = GUID 93639590-3d42-44c4-9573-d36e4144c423;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtPressureOn()";
				- _id = GUID 827c820e-5260-4250-b307-6bbc557d1c44;
			}
		}
		{ IReception 
			- _id = GUID 55d5fafe-7d09-4799-a117-44fff9e324ea;
			- _myState = 8192;
			- _modifiedTimeWeak = 1.2.1990::0:0:0;
			- _virtual = 0;
			- Args = { IRPYRawContainer 
				- size = 0;
			}
			- _event = { IHandle 
				- _m2Class = "IEvent";
				- _filename = "rampe.sbs";
				- _subsystem = "rampe";
				- _class = "";
				- _name = "evtPressureOff()";
				- _id = GUID 95fe958c-8018-4d85-a761-6f8cc139057a;
			}
		}
	}
	- _multiplicity = "";
	- StateCharts = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IStateChart 
			- _id = GUID 7fa439af-585e-4a70-9c19-0e7199d4a95c;
			- _myState = 10240;
			- _name = "statechart_3";
			- _modifiedTimeWeak = 9.12.2017::17:56:9;
			- _lastID = 17;
			- weakCGTime = 9.12.2017::17:56:9;
			- strongCGTime = 9.6.2017::11:47:51;
			- _multiplicity = "";
			- _itsStateChart = { IHandle 
				- _m2Class = "";
			}
			- _classModifier = Unspecified;
			- _defNumber = 8;
			- Transitions = { IRPYRawContainer 
				- size = 11;
				- value = 
				{ IDefaultDrvdTrans 
					- _id = GUID 6ecf1267-3adf-43cb-af3c-013d59a7cc8a;
					- _myState = 2048;
					- _name = "defaulttransition_1";
					- _modifiedTimeWeak = 9.6.2017::11:52:35;
					- _itsLabel = { ILabel 
						- _id = GUID f043e944-8f21-477f-b123-f0b3d7b6764c;
						- _modifiedTimeWeak = 1.2.1990::0:0:0;
						- _itsTrigger = NULL;
						- _itsGuard = NULL;
						- _itsAction = NULL;
					}
					- _itsTarget = GUID ac643f03-ec06-4a00-8f7a-534164645ff9;
					- _staticReaction = 0;
					- _itsSource = ;
					- _ofState = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
				}
				{ ITransition 
					- _id = GUID b7be4499-c787-47c8-b973-8bbca0fc1601;
					- _myState = 2048;
					- _name = "transition_2";
					- _modifiedTimeWeak = 9.12.2017::17:40:0;
					- _itsLabel = { ILabel 
						- _id = GUID 4c34519f-42df-4a38-a3a3-f6840d63a91b;
						- _modifiedTimeWeak = 9.12.2017::17:40:0;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 4bc294b6-8200-4ae6-98f6-186d983ab4d8;
							- _modifiedTimeWeak = 1.2.1990::0:0:0;
							- _body = "evtUnlocked";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtUnlocked()";
								- _id = GUID a3991b50-5ed7-4365-9d94-15664985ff55;
							}
						}
						- _itsGuard = NULL;
						- _itsAction = { IAction 
							- _id = GUID 397f24d9-34a4-49e6-bfd8-76f6d76245ad;
							- _modifiedTimeWeak = 9.12.2017::17:40:0;
							- _body = "getLock().gen(new evtUnlocked());";
						}
					}
					- _itsTarget = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
					- _staticReaction = 0;
					- _itsSource = GUID ac643f03-ec06-4a00-8f7a-534164645ff9;
				}
				{ ITransition 
					- _id = GUID af42d560-a789-4975-a067-d7cc16d97774;
					- _myState = 2048;
					- _name = "transition_3";
					- _modifiedTimeWeak = 9.12.2017::17:39:51;
					- _itsLabel = { ILabel 
						- _id = GUID 8c112e91-f008-425f-afd0-83b47ba9fd56;
						- _modifiedTimeWeak = 9.12.2017::17:39:51;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 68d1651f-7228-46ed-be9c-66766c1dd25d;
							- _modifiedTimeWeak = 1.2.1990::0:0:0;
							- _body = "evtLocked";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtLocked()";
								- _id = GUID 77ec7e25-aea9-442a-b73e-2f81408bb164;
							}
						}
						- _itsGuard = NULL;
						- _itsAction = { IAction 
							- _id = GUID a0ed1b49-6867-40d6-a92e-aa67652fd16c;
							- _modifiedTimeWeak = 9.12.2017::17:39:51;
							- _body = "getLock().gen(new evtLocked());";
						}
					}
					- _itsTarget = GUID ac643f03-ec06-4a00-8f7a-534164645ff9;
					- _staticReaction = 0;
					- _itsSource = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
				}
				{ ITransition 
					- _id = GUID fd9365f7-581a-4346-877a-c1581cb6c117;
					- _myState = 2048;
					- _name = "transition_4";
					- _modifiedTimeWeak = 9.12.2017::17:56:9;
					- _itsLabel = { ILabel 
						- _id = GUID 0e8d79b0-9b34-4bfe-a39d-1a6903ef8c45;
						- _modifiedTimeWeak = 9.12.2017::17:56:9;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 08d65f14-f230-4f0f-9fad-ecab61c68c89;
							- _modifiedTimeWeak = 9.6.2017::15:23:37;
							- _body = "evtOpenDoor";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOn()";
								- _id = GUID 827c820e-5260-4250-b307-6bbc557d1c44;
							}
						}
						- _itsGuard = { IGuard 
							- _id = GUID 2d21ecc5-868c-4c5e-be65-2f9b3ed83c18;
							- _modifiedTimeWeak = 9.12.2017::17:56:9;
							- _body = "isPort(getOpen())";
						}
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
					- _staticReaction = 0;
					- _itsSource = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
				}
				{ ITransition 
					- _id = GUID cffb94bf-ab6f-4ada-9359-208f17dc32d1;
					- _myState = 2048;
					- _name = "transition_5";
					- _modifiedTimeWeak = 9.6.2017::12:31:43;
					- _itsLabel = { ILabel 
						- _id = GUID dc916a2c-5bdc-4936-999e-a283bbce54a3;
						- _modifiedTimeWeak = 9.6.2017::12:31:43;
						- _itsTrigger = { ITimeout 
							- _id = GUID 79ab5d63-5360-441d-891b-0ddee5cdcd9e;
							- _modifiedTimeWeak = 1.2.1990::0:0:0;
							- _body = "tm(2200)";
							- _info = "";
							- _time = "2200";
						}
						- _itsGuard = NULL;
						- _itsAction = NULL;
					}
					- _itsTarget = GUID d880b2de-df28-4970-b50d-5d7bf7335659;
					- _staticReaction = 0;
					- _itsSource = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
				}
				{ ITransition 
					- _id = GUID 4afbbe07-4c8b-44c3-b69f-77ec620ecec4;
					- _myState = 2048;
					- _name = "transition_6";
					- _modifiedTimeWeak = 9.12.2017::17:55:52;
					- _itsLabel = { ILabel 
						- _id = GUID d3983ce4-51e4-49ed-ab90-084ffeea592c;
						- _modifiedTimeWeak = 9.12.2017::17:55:52;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 1450b130-ee41-4a13-82f4-8add8e77a8d6;
							- _modifiedTimeWeak = 9.6.2017::15:24:10;
							- _body = "evtCloseDoor";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOn()";
								- _id = GUID 827c820e-5260-4250-b307-6bbc557d1c44;
							}
						}
						- _itsGuard = { IGuard 
							- _id = GUID 851d6f53-8552-4a64-a221-f193f165f652;
							- _modifiedTimeWeak = 9.12.2017::17:55:52;
							- _body = "isPort(getClose())";
						}
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
					- _staticReaction = 0;
					- _itsSource = GUID d880b2de-df28-4970-b50d-5d7bf7335659;
				}
				{ ITransition 
					- _id = GUID ea620082-ecdd-4cad-9e20-6d5ebe0a987e;
					- _myState = 2048;
					- _name = "transition_7";
					- _modifiedTimeWeak = 9.6.2017::12:29:6;
					- _itsLabel = { ILabel 
						- _id = GUID 038c0d5c-4da6-47ee-adc9-1ed7d61aa6f7;
						- _modifiedTimeWeak = 9.6.2017::12:29:6;
						- _itsTrigger = { ITimeout 
							- _id = GUID a096d9fd-4def-4f49-9d2a-84aabfc6549c;
							- _modifiedTimeWeak = 1.2.1990::0:0:0;
							- _body = "tm(3600)";
							- _info = "";
							- _time = "3600";
						}
						- _itsGuard = NULL;
						- _itsAction = { IAction 
							- _id = GUID 686a078b-266e-4da6-b73c-e80fd31527c4;
							- _modifiedTimeWeak = 9.6.2017::12:29:6;
							- _body = "getClose().gen(new evtStopEV());";
						}
					}
					- _itsTarget = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
					- _staticReaction = 0;
					- _itsSource = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
				}
				{ ITransition 
					- _id = GUID 5160d8bb-d9a5-4358-b6f0-95750f72385a;
					- _myState = 2048;
					- _name = "transition_11";
					- _modifiedTimeWeak = 9.12.2017::17:56:2;
					- _itsLabel = { ILabel 
						- _id = GUID c5383b24-7b98-4a42-928d-4f256622c399;
						- _modifiedTimeWeak = 9.12.2017::17:56:2;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID a25ee473-0dbb-487a-9b23-f4d6c167c6e0;
							- _modifiedTimeWeak = 9.6.2017::15:29:40;
							- _body = "evtCloseDoor";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOn()";
								- _id = GUID 827c820e-5260-4250-b307-6bbc557d1c44;
							}
						}
						- _itsGuard = { IGuard 
							- _id = GUID b3300ea8-635b-4a69-ac55-9e57aa1f2715;
							- _modifiedTimeWeak = 9.12.2017::17:56:2;
							- _body = "isPort(getClose())";
						}
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
					- _staticReaction = 0;
					- _itsSource = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
				}
				{ ITransition 
					- _id = GUID 4c2d558a-8ee2-443f-9d69-9ac235ac7230;
					- _myState = 2048;
					- _name = "transition_12";
					- _modifiedTimeWeak = 9.12.2017::17:55:33;
					- _itsLabel = { ILabel 
						- _id = GUID 126c32bc-c0e5-467b-b4fa-63cfa2883128;
						- _modifiedTimeWeak = 9.12.2017::17:55:33;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 120202f7-8f2c-4cbb-8b82-3d778fe619ce;
							- _modifiedTimeWeak = 9.6.2017::15:30:13;
							- _body = "evtOpenDoor";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOn()";
								- _id = GUID 827c820e-5260-4250-b307-6bbc557d1c44;
							}
						}
						- _itsGuard = { IGuard 
							- _id = GUID 5f733b36-565e-4b72-a3ba-3ad876b97273;
							- _modifiedTimeWeak = 9.12.2017::17:55:33;
							- _body = "isPort(getOpen())";
						}
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
					- _staticReaction = 0;
					- _itsSource = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
				}
				{ ITransition 
					- _id = GUID cc70e40e-ce00-4b05-934f-31a2287cebf6;
					- _myState = 2048;
					- _name = "transition_14";
					- _modifiedTimeWeak = 9.6.2017::15:32:40;
					- _itsLabel = { ILabel 
						- _id = GUID b62cc761-c7cd-4f63-920d-0eca87f1de62;
						- _modifiedTimeWeak = 9.6.2017::15:32:40;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 5e2b623d-1697-46e2-83a6-ad7f754c6aab;
							- _modifiedTimeWeak = 9.6.2017::15:32:40;
							- _body = "evtInterrupt";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOff()";
								- _id = GUID 95fe958c-8018-4d85-a761-6f8cc139057a;
							}
						}
						- _itsGuard = NULL;
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
					- _staticReaction = 0;
					- _itsSource = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
				}
				{ ITransition 
					- _id = GUID 4957e78c-4548-40c9-8574-113c9e1bf239;
					- _myState = 2048;
					- _name = "transition_15";
					- _modifiedTimeWeak = 9.6.2017::15:32:52;
					- _itsLabel = { ILabel 
						- _id = GUID dd48aa8e-6dc1-4581-a7d3-53fe8400533b;
						- _modifiedTimeWeak = 9.6.2017::15:32:52;
						- _itsTrigger = { IInterfaceItemTrigger 
							- _id = GUID 96fb073b-3153-46cd-8ce2-f8530063ef53;
							- _modifiedTimeWeak = 9.6.2017::15:32:52;
							- _body = "evtInterrupt";
							- _info = "";
							- _itsInterfaceItem = { IHandle 
								- _m2Class = "IEvent";
								- _filename = "rampe.sbs";
								- _subsystem = "rampe";
								- _class = "";
								- _name = "evtPressureOff()";
								- _id = GUID 95fe958c-8018-4d85-a761-6f8cc139057a;
							}
						}
						- _itsGuard = NULL;
						- _itsAction = NULL;
					}
					- _itsTarget = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
					- _staticReaction = 0;
					- _itsSource = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
				}
			}
			- States = { IRPYRawContainer 
				- size = 7;
				- value = 
				{ IState 
					- _id = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _modifiedTimeWeak = 9.12.2017::14:28:37;
					- _parent = ;
					- _defaultTrans = GUID 6ecf1267-3adf-43cb-af3c-013d59a7cc8a;
				}
				{ IState 
					- _id = GUID ac643f03-ec06-4a00-8f7a-534164645ff9;
					- _name = "ClosedLocked";
					- _modifiedTimeWeak = 9.6.2017::11:52:55;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
				}
				{ IState 
					- _id = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
					- _name = "ClosedUnlocked";
					- _modifiedTimeWeak = 9.12.2017::14:28:26;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
				}
				{ IState 
					- _id = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
					- _name = "OpenToClose";
					- _modifiedTimeWeak = 9.12.2017::14:28:33;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
				}
				{ IState 
					- _id = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
					- _name = "CloseToOpen";
					- _modifiedTimeWeak = 9.12.2017::14:27:52;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
				}
				{ IState 
					- _id = GUID d880b2de-df28-4970-b50d-5d7bf7335659;
					- _name = "Open";
					- _modifiedTimeWeak = 9.12.2017::14:28:11;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
					- _entryAction = { IAction 
						- _id = GUID f2d880f4-156f-425c-a979-babf7b9438d9;
						- _myState = 4096;
						- _modifiedTimeWeak = 9.6.2017::12:32:7;
						- _body = "getOpen().gen(new evtStopEV());";
					}
				}
				{ IState 
					- _id = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
					- _name = "Middle";
					- _modifiedTimeWeak = 9.12.2017::14:28:44;
					- _parent = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
					- _defaultTrans = ;
				}
			}
			- _version = 9.12.2017::19:56:9;
			- _baseVersion = 1.1.1970::1:0:0;
			- _diagram = GUID afc60f75-c6ea-49e1-9bee-fd63a7f0f1f0;
			- Views = { IRPYRawContainer 
				- size = 1;
				- value = 
				{ IStateChartDiagram 
					- _id = GUID afc60f75-c6ea-49e1-9bee-fd63a7f0f1f0;
					- _myState = 10240;
					- _properties = { IPropertyContainer 
						- Subjects = { IRPYRawContainer 
							- size = 1;
							- value = 
							{ IPropertySubject 
								- _Name = "Format";
								- Metaclasses = { IRPYRawContainer 
									- size = 3;
									- value = 
									{ IPropertyMetaclass 
										- _Name = "DanglingTransition";
										- Properties = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IProperty 
												- _Name = "Line.LineWidth";
												- _Value = "2";
												- _Type = Int;
											}
										}
									}
									{ IPropertyMetaclass 
										- _Name = "DiagramFrame";
										- Properties = { IRPYRawContainer 
											- size = 8;
											- value = 
											{ IProperty 
												- _Name = "DefaultSize";
												- _Value = "20,20,590,500";
												- _Type = String;
											}
											{ IProperty 
												- _Name = "Fill.FillColor";
												- _Value = "247,247,247";
												- _Type = Color;
											}
											{ IProperty 
												- _Name = "Fill.Transparent_Fill";
												- _Value = "0";
												- _Type = Int;
											}
											{ IProperty 
												- _Name = "Font.Font";
												- _Value = "Tahoma";
												- _Type = String;
											}
											{ IProperty 
												- _Name = "Font.Size";
												- _Value = "8";
												- _Type = Int;
											}
											{ IProperty 
												- _Name = "Font.Weight@Child.NameCompartment@Name";
												- _Value = "700";
												- _Type = Int;
											}
											{ IProperty 
												- _Name = "Line.LineColor";
												- _Value = "194,192,192";
												- _Type = Color;
											}
											{ IProperty 
												- _Name = "Line.LineWidth";
												- _Value = "1";
												- _Type = Int;
											}
										}
									}
									{ IPropertyMetaclass 
										- _Name = "State";
										- Properties = { IRPYRawContainer 
											- size = 7;
											- value = 
											{ IProperty 
												- _Name = "DefaultSize";
												- _Value = "0,0,96,60";
												- _Type = String;
											}
											{ IProperty 
												- _Name = "Fill.FillColor";
												- _Value = "255,255,255";
												- _Type = Color;
											}
											{ IProperty 
												- _Name = "Font.Font";
												- _Value = "Tahoma";
												- _Type = String;
											}
											{ IProperty 
												- _Name = "Font.Size";
												- _Value = "8";
												- _Type = Int;
											}
											{ IProperty 
												- _Name = "Line.LineColor";
												- _Value = "109,163,217";
												- _Type = Color;
											}
											{ IProperty 
												- _Name = "Line.LineStyle";
												- _Value = "0";
												- _Type = Int;
											}
											{ IProperty 
												- _Name = "Line.LineWidth";
												- _Value = "1";
												- _Type = Int;
											}
										}
									}
								}
							}
						}
					}
					- _name = "statechartdiagram_0";
					- _modifiedTimeWeak = 9.12.2017::17:49:14;
					- _lastModifiedTime = "9.12.2017::17:56:9";
					- _graphicChart = { CGIStateChart 
						- _id = GUID 744c1e66-f32e-4f80-a396-edcc5e8c7809;
						- m_type = 0;
						- m_pModelObject = { IHandle 
							- _m2Class = "IStateChart";
							- _id = GUID 7fa439af-585e-4a70-9c19-0e7199d4a95c;
						}
						- m_pParent = ;
						- m_name = { CGIText 
							- m_str = "";
							- m_style = "Arial" 10 0 0 0 1 ;
							- m_color = { IColor 
								- m_fgColor = 0;
								- m_bgColor = 0;
								- m_bgFlag = 0;
							}
							- m_position = 1 0 0  ;
							- m_nIdent = 0;
							- m_bImplicitSetRectPoints = 0;
							- m_nOrientationCtrlPt = 8;
						}
						- m_drawBehavior = 4096;
						- m_bIsPreferencesInitialized = 1;
						- elementList = 19;
						{ CGIDiagramFrame 
							- _id = GUID 3ef8c065-3f14-41fa-ad29-235575badc7d;
							- m_type = 203;
							- m_pModelObject = { IHandle 
								- _m2Class = "";
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_transform = 4.52778 0 0 3.63636 20 20 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 132  216 132  216 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
						}
						{ CGIState 
							- _id = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_type = 5;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID 17c98f3a-93da-4c2b-bb54-bfad081da243;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "ROOT";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 0;
							- m_bIsPreferencesInitialized = 0;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 0  0 0  0 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID 5b3f78fe-8ef9-43db-9cc4-2dedfb680d11;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID ac643f03-ec06-4a00-8f7a-534164645ff9;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "ClosedLocked";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.0875912 0 0 0.0566038 101 213 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID 1ee8508b-30eb-4d1e-9732-9c20c6dc8218;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID b11dece9-08af-4359-bb06-532b0a64a54c;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "ClosedUnlocked";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.0875912 0 0 0.0566038 292 214 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID a2205ddd-5781-4c5a-a546-b249822d5896;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID 060892e9-e8c5-4c04-beea-c077dd26518d;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "OpenToClose";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.0875912 0 0 0.0566038 550 351 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID 8269ff21-b5db-4558-bb58-5da2b72acf75;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID 4fbd8d70-d796-4a0b-9b30-68a29d3a1c19;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "CloseToOpen";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.0875912 0 0 0.0566038 550 76 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID 54ced855-a9e6-43d4-80e6-622df371c85b;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 2;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "FitBoxToItsTextuals";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 2;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
													{ IProperty 
														- _Name = "ShowReactions";
														- _Value = "True";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID d880b2de-df28-4970-b50d-5d7bf7335659;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "Open";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.187044 0 0 0.0754717 783 205 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_bFramesetModified = 1;
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- frameset = "<frameset rows=82%,18%>
<frame name=ReactionsListCompartment>
<frame name=StructureCompartment>";
							- Compartments = { IRPYRawContainer 
								- size = 1;
								- value = 
								{ CGICompartment 
									- _id = GUID b909549e-24c8-4d61-88a8-37548edf771e;
									- m_name = "Reactions";
									- m_displayOption = All;
									- m_bShowInherited = 0;
									- m_bOrdered = 0;
									- _itemValueOfFontPropertiesMapCount = 1;
									- _fontPropValues = "Tahoma 8 400 0 0 0 0";
								}
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGIState 
							- _id = GUID ac4d8e2a-8526-4768-959f-098fe830352e;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "StatechartDiagram";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "State";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "Compartments";
														- _Value = "";
														- _Type = MultiLine;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 8;
							- m_pModelObject = { IHandle 
								- _m2Class = "IState";
								- _id = GUID 7ce25d92-1b29-4e2c-b374-2e765284d862;
							}
							- m_pParent = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_name = { CGIText 
								- m_str = "Middle";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 5;
							}
							- m_drawBehavior = 4104;
							- m_transform = 0.0875912 0 0 0.0566038 547 207 ;
							- m_bIsPreferencesInitialized = 1;
							- m_AdditionalLabel = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 1;
							}
							- m_polygon = 4 0 0  0 1060  1096 1060  1096 0  ;
							- m_nNameFormat = 0;
							- m_nIsNameFormat = 0;
							- Compartments = { IRPYRawContainer 
								- size = 0;
							}
							- nAndLineCount = 0;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_pDefaultComponentRelation = ;
						}
						{ CGITrans 
							- _id = GUID b7285ed5-9101-4809-a5e3-72f6c48c1724;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 29;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID 6ecf1267-3adf-43cb-af3c-013d59a7cc8a;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
							- m_sourceType = 'F';
							- m_pTarget = GUID 5b3f78fe-8ef9-43db-9cc4-2dedfb680d11;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 144 132 ;
							- m_TargetPort = 479 177 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID d8dc9687-05ab-4939-908d-e0d46663efaf;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID b7be4499-c787-47c8-b973-8bbca0fc1601;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 5b3f78fe-8ef9-43db-9cc4-2dedfb680d11;
							- m_sourceType = 'F';
							- m_pTarget = GUID 1ee8508b-30eb-4d1e-9732-9c20c6dc8218;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtUnlocked/getLock().gen(new evtUnlocked());";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  241 -9  241 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 40 298 ;
								- m_nHorizontalSpacing = -132;
								- m_nVerticalSpacing = 37;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 1096 866 ;
							- m_TargetPort = 0 866 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID c46fc436-aa4f-482d-b370-cf790ff38c96;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID af42d560-a789-4975-a067-d7cc16d97774;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 1ee8508b-30eb-4d1e-9732-9c20c6dc8218;
							- m_sourceType = 'F';
							- m_pTarget = GUID 5b3f78fe-8ef9-43db-9cc4-2dedfb680d11;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtLocked/getLock().gen(new evtLocked());";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  216 -9  216 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 100 199 ;
								- m_nHorizontalSpacing = -74;
								- m_nVerticalSpacing = -38;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 0 442 ;
							- m_TargetPort = 1096 442 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID 224288ce-9276-4a31-8071-7ccad836a471;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID fd9365f7-581a-4346-877a-c1581cb6c117;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 1ee8508b-30eb-4d1e-9732-9c20c6dc8218;
							- m_sourceType = 'F';
							- m_pTarget = GUID 8269ff21-b5db-4558-bb58-5da2b72acf75;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOn[isPort(getOpen())]";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  198 -9  198 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 345 101 ;
								- m_nHorizontalSpacing = -84;
								- m_nVerticalSpacing = -18;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 788 0 ;
							- m_TargetPort = 0 565 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID c95492aa-7e66-4c4b-b938-f8400a6cc338;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID cffb94bf-ab6f-4ada-9359-208f17dc32d1;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 8269ff21-b5db-4558-bb58-5da2b72acf75;
							- m_sourceType = 'F';
							- m_pTarget = GUID 54ced855-a9e6-43d4-80e6-622df371c85b;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "tm(2200)";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  50 -9  50 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 766 103 ;
								- m_nHorizontalSpacing = -44;
								- m_nVerticalSpacing = -4;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 1096 724 ;
							- m_TargetPort = 114 0 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID 86dfc425-1e4f-4cba-af25-c3a34592154f;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID 4afbbe07-4c8b-44c3-b69f-77ec620ecec4;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 54ced855-a9e6-43d4-80e6-622df371c85b;
							- m_sourceType = 'F';
							- m_pTarget = GUID a2205ddd-5781-4c5a-a546-b249822d5896;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOn[isPort(getClose())]";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  201 -9  201 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 768 389 ;
								- m_nHorizontalSpacing = -49;
								- m_nVerticalSpacing = 25;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 183 1060 ;
							- m_TargetPort = 1096 495 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID 43b45db2-bcc0-43d3-bd5e-d45bb356a54a;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID ea620082-ecdd-4cad-9e20-6d5ebe0a987e;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID a2205ddd-5781-4c5a-a546-b249822d5896;
							- m_sourceType = 'F';
							- m_pTarget = GUID 1ee8508b-30eb-4d1e-9732-9c20c6dc8218;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "tm(3600)/getClose().gen(new evtStopEV());";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  229 -9  229 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 342 404 ;
								- m_nHorizontalSpacing = -80;
								- m_nVerticalSpacing = 38;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 0 618 ;
							- m_TargetPort = 685 1060 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID e2b6e820-dc58-4bb0-9105-b7c95d8d02d0;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID 5160d8bb-d9a5-4358-b6f0-95750f72385a;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID ac4d8e2a-8526-4768-959f-098fe830352e;
							- m_sourceType = 'F';
							- m_pTarget = GUID a2205ddd-5781-4c5a-a546-b249822d5896;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOn[isPort(getClose())]";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  198 -9  198 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 434 306 ;
								- m_nHorizontalSpacing = -157;
								- m_nVerticalSpacing = -10;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 308 989 ;
							- m_TargetPort = 194 283 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID 6972001d-518a-4ad8-929c-49c99eed5ba1;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID 4c2d558a-8ee2-443f-9d69-9ac235ac7230;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID ac4d8e2a-8526-4768-959f-098fe830352e;
							- m_sourceType = 'F';
							- m_pTarget = GUID 8269ff21-b5db-4558-bb58-5da2b72acf75;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOn[isPort(getOpen())]";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  198 -9  198 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 608 184 ;
								- m_nVerticalSpacing = 7;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 868 194 ;
							- m_TargetPort = 731 972 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID f3bcf76e-16b6-405f-bcbb-68750da5563c;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID cc70e40e-ce00-4b05-934f-31a2287cebf6;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID 8269ff21-b5db-4558-bb58-5da2b72acf75;
							- m_sourceType = 'F';
							- m_pTarget = GUID ac4d8e2a-8526-4768-959f-098fe830352e;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOff";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  82 -9  82 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 509 154 ;
								- m_nHorizontalSpacing = -73;
								- m_nVerticalSpacing = -25;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 91 1060 ;
							- m_TargetPort = 183 0 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						{ CGITrans 
							- _id = GUID 4533b997-ceaa-4c22-b3c0-1bbe0ddb6302;
							- _properties = { IPropertyContainer 
								- Subjects = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertySubject 
										- _Name = "General";
										- Metaclasses = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IPropertyMetaclass 
												- _Name = "Graphics";
												- Properties = { IRPYRawContainer 
													- size = 1;
													- value = 
													{ IProperty 
														- _Name = "ShowLabels";
														- _Value = "False";
														- _Type = Bool;
													}
												}
											}
										}
									}
								}
							}
							- m_type = 28;
							- m_pModelObject = { IHandle 
								- _m2Class = "ITransition";
								- _id = GUID 4957e78c-4548-40c9-8574-113c9e1bf239;
							}
							- m_pParent = ;
							- m_name = { CGIText 
								- m_str = "";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 1 0 0  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_nOrientationCtrlPt = 8;
							}
							- m_drawBehavior = 4096;
							- m_bIsPreferencesInitialized = 1;
							- m_pSource = GUID a2205ddd-5781-4c5a-a546-b249822d5896;
							- m_sourceType = 'F';
							- m_pTarget = GUID ac4d8e2a-8526-4768-959f-098fe830352e;
							- m_targetType = 'T';
							- m_direction = ' ';
							- m_rpn = { CGIText 
								- m_str = "evtPressureOff";
								- m_style = "Arial" 10 0 0 0 1 ;
								- m_color = { IColor 
									- m_fgColor = 0;
									- m_bgColor = 0;
									- m_bgFlag = 0;
								}
								- m_position = 4 -6 -9  82 -9  82 5  -6 5  ;
								- m_nIdent = 0;
								- m_bImplicitSetRectPoints = 0;
								- m_transform = 1 0 0 1 615 336 ;
								- m_nHorizontalSpacing = -7;
								- m_nVerticalSpacing = 19;
								- m_nOrientationCtrlPt = 0;
							}
							- m_anglePoint1 = 0 0 ;
							- m_anglePoint2 = 0 0 ;
							- m_line_style = 1;
							- m_SourcePort = 936 0 ;
							- m_TargetPort = 959 1060 ;
							- m_pInheritsFrom = { IHandle 
								- _m2Class = "";
							}
							- m_nInheritanceMask = 0;
							- m_bShowName = 1;
						}
						
						- m_access = 'Z';
						- m_modified = 'N';
						- m_fileVersion = "";
						- m_nModifyDate = 0;
						- m_nCreateDate = 0;
						- m_creator = "";
						- m_bScaleWithZoom = 1;
						- m_arrowStyle = 'S';
						- m_pRoot = GUID 32611a8d-1c2c-4fab-ae22-f8711dbc242b;
						- m_currentLeftTop = 0 0 ;
						- m_currentRightBottom = 0 0 ;
						- m_bFreezeCompartmentContent = 0;
						- m_pInheritsFrom = { IHandle 
							- _m2Class = "";
						}
					}
				}
			}
		}
	}
	- _itsStateChart = { IHandle 
		- _m2Class = "IStateChart";
		- _id = GUID 7fa439af-585e-4a70-9c19-0e7199d4a95c;
	}
	- _classModifier = Unspecified;
}

