package edu.pitt.cs;

import org.mockito.Mockito;

public interface RentACat {
	public static RentACat createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return new RentACatImpl();
			case BUGGY:
				return new RentACatBuggy();
			case SOLUTION:
				return new RentACatSolution();
			case MOCK:
				// Cat ret = Mockito.mock(Cat.class);

				// Mockito.when(ret.getId()).thenReturn(id);
				// Mockito.when(ret.getName()).thenReturn(name);
				// Mockito.when(ret.getRented()).thenReturn(false);
				// //add tostring
				// Mockito.when(ret.toString()).thenReturn("ID " + id + ". " + name);
				// return ret;

				return Mockito.mock(RentACat.class);
				// RentACat mockRentACat = Mockito.mock(RentACat.class);
    
				// // Example behavior setup for mock object
				// Mockito.when(mockRentACat.listCats()).thenReturn("Cat list");
				// Mockito.when(mockRentACat.rentCat(Mockito.anyInt())).thenReturn(true);
				// Mockito.when(mockRentACat.returnCat(Mockito.anyInt())).thenReturn(true);
				// Mockito.when(mockRentACat.renameCat(Mockito.anyInt(), Mockito.anyString())).thenReturn(true);
				
				// return mockRentACat;
				
				
			default:
				assert (false);
				return null;
		}
	}

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.

	public boolean returnCat(int id);

	public boolean rentCat(int id);

	public boolean renameCat(int id, String name);

	public String listCats();

	public void addCat(Cat c);
}
