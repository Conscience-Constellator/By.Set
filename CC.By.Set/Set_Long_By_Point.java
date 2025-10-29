package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Point;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Long1$1;
import CC.$.Q$Q.Point$Long;
import CC.$.Q2$.Point_Long$;
import CC.$.Q2$1.Long2$1;

public interface Set_Long_By_Point<By_Typ,From_Typ> extends
	Get_Long_By_Point<By_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Point_Long$<By_Typ>
{
	@Lin_Dclar void Set_Long_By_Point(By_Typ By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Long$(By_Typ By,long Valu){Set_Long_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Point_Sorc(By_Typ By,Point$Long<By_Typ> Sorc){Set_Long_By_Point(By,Sorc.Point$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Point(By_Typ By,Long1$1 Fun,long Valu)
			{Set_Long_By_Point(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Point_Sorc(By_Typ By,Long1$1 Fun,Point$Long<By_Typ> Sorc)
			{Set_Long1$1_By_Point(By,Fun,Sorc.Point$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Point(By_Typ By,Long1$1 Fun)
				{Set_Long1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Point(By_Typ By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Point(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Point_SLit(By_Typ By,Long2$1 Fun,Point$Long<By_Typ> A,long B)
			{Set_Long2$1_By_Point(By,Fun,A.Point$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Point(By_Typ By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Point_Sorc(By_Typ By,Long2$1 Fun,Point$Long<By_Typ> A,Point$Long<By_Typ> B)
				{Set_Long2$1_By_Point_SLit(By,Fun,A,B.Point$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Point_Sorc(By_Typ By,Long2$1 Fun,Point$Long<By_Typ> B)
					{Set_Long2$1_By_Point_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Point(By_Typ By,long Valu)
	{
		long Stor=Get_Long_By_Point(By);
		Set_Long_By_Point(By,Valu);

		return Stor;
	}
}